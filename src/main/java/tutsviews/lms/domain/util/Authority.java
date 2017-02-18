package tutsviews.lms.domain.util;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by ALadin Zaier PC IBS on 18/02/2017.
 */
public class Authority implements GrantedAuthority {

        private final String authority;

        public Authority(String authority) {
            this.authority = authority;
        }

        @Override
        public String getAuthority() {
            return authority;
        }
    }






