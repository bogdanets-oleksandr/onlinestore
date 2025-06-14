package io.teamchallenge.controller;

import io.teamchallenge.annotation.AllowedSortFields;
import io.teamchallenge.annotation.CurrentUserId;
import io.teamchallenge.annotation.ValidOrderRequest;
import io.teamchallenge.dto.order.OrderRequestDto;
import io.teamchallenge.dto.order.OrderResponseDto;
import io.teamchallenge.dto.order.OrderFilterDto;
import io.teamchallenge.dto.order.ShortOrderResponseDto;
import io.teamchallenge.dto.pageable.PageableDto;
import io.teamchallenge.enumerated.DeliveryStatus;
import io.teamchallenge.service.impl.OrderService;
import jakarta.validation.Valid;
import java.security.Principal;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.domain.Sort.Direction.DESC;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
@Validated
public class OrderController {
    private final OrderService orderService;

    /**
     * Creates a new order based on the provided {@link OrderRequestDto} and the authenticated user.
     * This method handles HTTP POST requests to create a new order. It uses the {@link OrderRequestDto} to gather
     * order details and the {@link Principal} to identify the authenticated user.
     *
     * @param orderRequestDto the DTO containing the details of the order request.
     * @param userPrincipal   the authenticated user's principal.
     * @return a {@link ResponseEntity} containing the ID of the newly created order and  HTTP status {@code CREATED}.
     */
    @PostMapping
    public ResponseEntity<Long> create(@RequestBody @ValidOrderRequest OrderRequestDto orderRequestDto,
                                       Principal userPrincipal) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.create(orderRequestDto, userPrincipal));
    }

    /**
     * Retrieves an order by its unique identifier.
     *
     * @param orderId The unique identifier of the order.
     * @return A {@link ResponseEntity} containing the {@link OrderResponseDto}
     *          with the order details and HTTP status OK.
     */
    @GetMapping("/{orderId}")
    public ResponseEntity<OrderResponseDto> getOrderById(@PathVariable Long orderId) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getById(orderId));
    }

    /**
     * Updates the order details of an order.
     *
     * @param orderId The unique identifier of the order.
     * @param orderRequestDto  The DTO containing all order detail fields.
     * @return Status Code 204.
     */

    @PutMapping("/{orderId}")
    public ResponseEntity<Void> changeOrderDetails(@PathVariable Long orderId,
                                            @RequestBody @ValidOrderRequest OrderRequestDto orderRequestDto) {
        orderService.changeOrderDetails(orderId, orderRequestDto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * Updates the delivery status of an order.
     *
     * @param orderId The unique identifier of the order.
     * @param status  The new delivery status to be set for the order.
     * @return A {@link ResponseEntity} with HTTP status CREATED.
     */
    @PatchMapping("/{orderId}")
    public ResponseEntity<Void> setOrderStatus(@PathVariable Long orderId, @RequestParam DeliveryStatus status) {
        orderService.setDeliveryStatus(orderId, status);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * Cancels an order if the user has the specified order.
     *
     * @param orderId The unique identifier of the order to be canceled.
     * @param userId  The unique identifier of the user requesting the cancellation.
     * @return A {@link ResponseEntity} with HTTP status CREATED.
     */
    @PatchMapping("/cancel/{orderId}")
    public ResponseEntity<Void> cancelOrder(@PathVariable Long orderId, @CurrentUserId Long userId) {
        orderService.cancelOrder(orderId, userId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * Retrieves a pageable list of orders filtered by the given parameters.
     *
     * @param filterParametersDto The filter parameters to apply to the query.
     * @param pageable            The pagination and sorting information.
     * @return A {@link ResponseEntity} containing a {@link PageableDto} with a list
     *          of {@link ShortOrderResponseDto} and HTTP status OK.
     */
    @GetMapping
    public ResponseEntity<PageableDto<ShortOrderResponseDto>> getAllOrders(
        @Valid OrderFilterDto filterParametersDto,
        @AllowedSortFields(values = {"id", "createdAt", "isPaid", "deliveryStatus", "deliveryMethod", "total"})
        @PageableDefault(sort = "createdAt", direction = DESC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getAllByFilter(filterParametersDto, pageable));
    }
}
