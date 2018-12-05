package org.herokutest.app.web.signin;

import org.herokutest.app.web.base.HerokutestBaseAction;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

/**
 * @author masaki.kamachi
 * @author jflute
 */
public class SigninReminderAction extends HerokutestBaseAction {

    // #pending now making...
    @Execute
    public HtmlResponse index() {
        return asHtml(path_Signin_SigninReminderHtml);
    }
}
