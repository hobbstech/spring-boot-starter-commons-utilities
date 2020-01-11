package io.github.hobbstech.commons.utilities.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemProperties {

    @Value("${system.name}")
    public String systemName;

    @Value("${email.origin.sender}")
    public String emailOriginSender;

    @Value("${path.file-storage.base}")
    public String fileStorageBasePath;

    @Value("${jwt.secret}")
    public String jwtSecret;
}
