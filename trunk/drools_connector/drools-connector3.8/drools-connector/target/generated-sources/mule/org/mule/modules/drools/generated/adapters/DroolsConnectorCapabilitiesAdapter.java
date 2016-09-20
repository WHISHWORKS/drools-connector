
package org.mule.modules.drools.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.drools.DroolsConnector;


/**
 * A <code>DroolsConnectorCapabilitiesAdapter</code> is a wrapper around {@link DroolsConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-09-20T12:14:03+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class DroolsConnectorCapabilitiesAdapter
    extends DroolsConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
