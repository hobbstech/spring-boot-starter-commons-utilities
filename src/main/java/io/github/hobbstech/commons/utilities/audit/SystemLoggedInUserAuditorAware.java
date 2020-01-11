package io.github.hobbstech.commons.utilities.audit;

import lombok.val;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static java.util.Objects.isNull;

@Component
public class SystemLoggedInUserAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        val authentication = SecurityContextHolder.getContext().getAuthentication();

        if (isNull(authentication)) {
            return Optional.empty();
        }

        return Optional.of(((UserDetails) authentication.getPrincipal()).getUsername());
    }
}
