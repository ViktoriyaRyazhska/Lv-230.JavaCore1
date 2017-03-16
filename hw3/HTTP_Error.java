import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Тарас on 12.03.2017.
 */
public class HTTP_Error {
    public enum HTTPError {
        BAD_REQUEST, UNAUTORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND,METHOD_NOT_ALLOWED,
        NON_ACCEPTABLE,PROXY_AUTHENTICATION_REQUIRED,REQUEST_TIME_OUT,CONFLICT,GONE,LENGTH_REQUIRED,
        PRECONDITION_FAILED,PAYLOAD_TOO_LARGE,URI_TOO_LONG,UNSUPPOSED_MEDIA_TYPE,RANGE_NOT_SATISFIABLE,
        EXPECTATION_FAILED,I_AM_A_TEAPOT,MISDIRECTED_REQUEST,UNPROCESSABLE_ENTITY,LOCKED,FAILED_DEPENDENCY,
        UPGRADE_REQUIRED,PRECONDITION_REQUIRED,TOO_MANY_REQUESTS,REQUEST_HEADER_FIELDS_TOO_LARGE,
        UNAVAILABLE_FOR_LEGAL_REASONS,

    }

    public static void main(String[] args) throws IOException {
        HTTPError ht = HTTPError.BAD_REQUEST;
        ht = null;
        System.out.println("Enter the error number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        switch (number){
           case 400:
               ht = HTTPError.BAD_REQUEST;
               break;
            case 401:
                ht = HTTPError.UNAUTORIZED;
                break;
            case 402:
                ht = HTTPError.PAYMENT_REQUIRED;
                break;
            case 403:
                ht = HTTPError.FORBIDDEN;
                break;
            case 404:
                ht = HTTPError.NOT_FOUND;
                break;
            case 405:
                ht = HTTPError.METHOD_NOT_ALLOWED;
                break;
            case 406:
                ht = HTTPError.NON_ACCEPTABLE;
                break;
            case 407:
                ht = HTTPError.PROXY_AUTHENTICATION_REQUIRED;
                break;
            case 408:
                ht = HTTPError.REQUEST_TIME_OUT;
                break;
            case 409:
                ht = HTTPError.CONFLICT;
                break;
            case 410:
                ht = HTTPError.GONE;
                break;
            case 411:
                ht = HTTPError.LENGTH_REQUIRED;
                break;
            case 412:
                ht = HTTPError.PRECONDITION_FAILED;
                break;
            case 413:
                ht = HTTPError.PAYLOAD_TOO_LARGE;
                break;
            case 414:
                ht = HTTPError.URI_TOO_LONG;
                break;
            case 415:
                ht = HTTPError.UNSUPPOSED_MEDIA_TYPE;
                break;
            case 416:
                ht = HTTPError.RANGE_NOT_SATISFIABLE;
                break;
            case 417:
                ht = HTTPError.EXPECTATION_FAILED;
                break;
            case 418:
                ht = HTTPError.I_AM_A_TEAPOT;
                break;
            case 421:
                ht = HTTPError.MISDIRECTED_REQUEST;
                break;
            case 422:
                ht = HTTPError.UNPROCESSABLE_ENTITY;
                break;
            case 423:
                ht = HTTPError.LOCKED;
                break;
            case 424:
                ht = HTTPError.FAILED_DEPENDENCY;
                break;
            case 426:
                ht = HTTPError.UPGRADE_REQUIRED;
                break;
            case 428:
                ht = HTTPError.PRECONDITION_REQUIRED;
                break;
            case 429:
                ht = HTTPError.TOO_MANY_REQUESTS;
                break;
            case 431:
                ht = HTTPError.REQUEST_HEADER_FIELDS_TOO_LARGE;
                break;
            case 451:
                ht = HTTPError.UNAVAILABLE_FOR_LEGAL_REASONS;
                break;
            default:
                System.out.println("unavailable number");
                break;
        }
        System.out.println(ht);
    }
}