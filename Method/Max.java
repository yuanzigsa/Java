package Method;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.net.SocketOption;

public class Max {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
