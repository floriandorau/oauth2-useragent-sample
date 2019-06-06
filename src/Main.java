import com.microsoft.alm.oauth2.useragent.AuthorizationException;
import com.microsoft.alm.oauth2.useragent.AuthorizationResponse;
import com.microsoft.alm.oauth2.useragent.UserAgent;
import com.microsoft.alm.oauth2.useragent.UserAgentImpl;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(final String[] args) throws AuthorizationException, URISyntaxException {
        final URI authorizationEndpoint = new URI("https://login.microsoftonline.com/db8e2f82-8a37-4c09-b7de-ed06547b5a20/oauth2/v2.0/authorize");
        final URI redirectUri = new URI("http://localhost:8080/login/oauth2/code/azure");

        final UserAgent userAgent = new UserAgentImpl();

        final AuthorizationResponse authorizationResponse = userAgent.requestAuthorizationCode(authorizationEndpoint, redirectUri);
        final String code = authorizationResponse.getCode();

        System.out.print("Authorization Code: ");
        System.out.println(code);
    }
}
