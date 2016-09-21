
package org.mule.modules.drools.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.drools.DroolsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>DroolsConnectorProcessAdapter</code> is a wrapper around {@link DroolsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-09-21T12:29:12+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class DroolsConnectorProcessAdapter
    extends DroolsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<DroolsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, DroolsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final DroolsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,DroolsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, DroolsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, DroolsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
