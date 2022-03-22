package netty.kyro.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
public class RpcResponse {
    private String message;
}
