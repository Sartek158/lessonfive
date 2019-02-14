import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter
import de.huxhorn.lilith.logback.appender.ClassicMultiplexSocketAppender

final String LOG_PATTERN = "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"

appender("STDOUT", ConsoleAppender) {
    filter(ThresholdFilter) {
        level = INFO
    }
    encoder(PatternLayoutEncoder) {
        pattern = LOG_PATTERN
    }
}

appender("multiplex", ClassicMultiplexSocketAppender) {
    compressing = true
    reconnectionDelay = 10000L
    includeCallerData = true
    remoteHost = "localhost"
}

/**
 * <appender name="multiplex" class="de.huxhorn.lilith.logback.appender.ClassicMultiplexSocketAppender">
 *   <Compressing>true</Compressing>
 *   <!-- will automatically use correct default port -->
 *   <!-- Default port for compressed is 10000 and uncompressed 10001 -->
 *   <ReconnectionDelay>10000</ReconnectionDelay>
 *   <IncludeCallerData>true</IncludeCallerData>
 *   <RemoteHosts>localhost, 10.200.55.13</RemoteHosts>
 *   <!-- Alternatively:
 *   <RemoteHost>localhost</RemoteHost>
 *   <RemoteHost>10.200.55.13</RemoteHost>
 *   -->
 *   <!--
 *   Optional:
 *   <CreatingUUID>false</CreatingUUID>
 *   -->
 * </appender>
 */

appender("FILE", FileAppender) {
    file = "c:\\EDU\\Homework\\info.txt"
    filter(ThresholdFilter) {
        level = INFO
    }
    encoder(PatternLayoutEncoder) {
        pattern = LOG_PATTERN
    }
}

root(INFO, ["STDOUT", "multiplex"])
