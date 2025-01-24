package nutshell.server.dto.timeBlock.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TimeBlockDto(
        Long id,
        Boolean isAllTime,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm", timezone = "Asia/Seoul")
        LocalDateTime startTime,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm", timezone = "Asia/Seoul")
        LocalDateTime endTime
) {
        public static TimeBlockDto of(final Long id, final Boolean isAllTime, final LocalDateTime startTime, final LocalDateTime endTime) {

                return TimeBlockDto.builder()
                .id(id)
                .isAllTime(isAllTime == null ? false : isAllTime)
                .startTime(startTime)
                .endTime(endTime)
                .build();
        }
}
