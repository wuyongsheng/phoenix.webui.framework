/**
 * http://surenpi.com
 */
package org.suren.autotest.web.framework.selenium.locator;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.Locator;
import org.suren.autotest.web.framework.core.LocatorAware;

/**
 * @author suren
 * @date 2016年7月25日 上午8:12:32
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SeleniumCssLocator implements Locator, LocatorAware
{

	@Override
	public String getType()
	{
		// TODO Auto-generated method stub
		return "byCss";
	}

	@Override
	public String getValue()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(String value)
	{
		// TODO Auto-generated method stub
		
	}

}
