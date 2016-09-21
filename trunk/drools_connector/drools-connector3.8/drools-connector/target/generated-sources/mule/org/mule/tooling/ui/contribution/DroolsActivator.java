
package org.mule.tooling.ui.contribution;

import javax.annotation.Generated;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-09-21T12:29:12+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class DroolsActivator
    extends AbstractUIPlugin
{

    public final static String PLUGIN_ID = "org.mule.tooling.ui.contribution.drools";
    private static org.mule.tooling.ui.contribution.DroolsActivator plugin;

    public void start(BundleContext context)
        throws Exception
    {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context)
        throws Exception
    {
        plugin = null;
        super.stop(context);
    }

    public static org.mule.tooling.ui.contribution.DroolsActivator getDefault() {
        return plugin;
    }

}
