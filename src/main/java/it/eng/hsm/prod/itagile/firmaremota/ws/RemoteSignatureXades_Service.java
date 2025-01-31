/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.hsm.prod.itagile.firmaremota.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1 2017-08-29T19:04:14.205+02:00 Generated source version:
 * 2.7.14.redhat-1
 *
 */
@WebServiceClient(name = "remoteSignatureXades", wsdlLocation = "https://firmaremota.ente.regione.emr.it/FirmaRemota/services/RemoteSignatureXades?wsdl", targetNamespace = "http://impl.ws.firmaremota.itagile.it/")
public class RemoteSignatureXades_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.ws.firmaremota.itagile.it/", "remoteSignatureXades");
    public final static QName RemoteSignatureXadesPort = new QName("http://impl.ws.firmaremota.itagile.it/",
            "remoteSignatureXadesPort");
    static {
        URL url = null;
        try {
            url = new URL("https://firmaremota.ente.regione.emr.it/FirmaRemota/services/RemoteSignatureXades?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RemoteSignatureXades_Service.class.getName()).log(
                    java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}",
                    "https://firmaremota.ente.regione.emr.it/FirmaRemota/services/RemoteSignatureXades?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RemoteSignatureXades_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RemoteSignatureXades_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemoteSignatureXades_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    // compliant code instead.
    public RemoteSignatureXades_Service(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    // compliant code instead.
    public RemoteSignatureXades_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    // compliant code instead.
    public RemoteSignatureXades_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return returns RemoteSignatureXades
     */
    @WebEndpoint(name = "remoteSignatureXadesPort")
    public RemoteSignatureXades getRemoteSignatureXadesPort() {
        return super.getPort(RemoteSignatureXadesPort, RemoteSignatureXades.class);
    }

    /**
     *
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in
     *            the <code>features</code> parameter will have their default values.
     *
     * @return returns RemoteSignatureXades
     */
    @WebEndpoint(name = "remoteSignatureXadesPort")
    public RemoteSignatureXades getRemoteSignatureXadesPort(WebServiceFeature... features) {
        return super.getPort(RemoteSignatureXadesPort, RemoteSignatureXades.class, features);
    }
}
