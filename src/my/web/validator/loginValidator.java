package my.web.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import static javax.faces.application.FacesMessage.SEVERITY_ERROR;

/**
 * Created by User on 20.03.2015.
 */
@FacesValidator("my.web.validator.loginValidator")
public class loginValidator implements Validator{
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if(o.toString().length() < 5){
            FacesMessage message = new FacesMessage("Введите больше пяти символов");
            message.setSeverity(SEVERITY_ERROR);
            throw new ValidatorException(message);

        }
    }
}
