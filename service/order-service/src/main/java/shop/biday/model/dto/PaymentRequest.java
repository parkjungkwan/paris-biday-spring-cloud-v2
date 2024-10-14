package shop.biday.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PaymentRequest(
        @Schema(description = "낙찰 아이디", example = "2")
        @Positive
        @NotNull(message = "필수 값입니다.")
        Long awardId,

        @Schema(description = "주문번호", example = "rovneuls-sfg-rtwefh")
        @NotBlank(message = "결제의 키는 반드시 존재하고, 빈 값과 공백일 수 없습니다.")
        String paymentKey,

        @Schema(description = "결제 가격", example = "100000")
        @Positive
        @NotNull(message = "필수 값입니다.")
        Long amount,

        @Schema(description = "주문번호", example = "kjeijtbsk-342")
        @NotBlank(message = "주문번호는 반드시 존재하고, 빈 값과 공백일 수 없습니다.")
        String orderId) {
}
