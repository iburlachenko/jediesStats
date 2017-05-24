package ut.com.atlasian.plugins.jediesStats;

import org.junit.Test;
import com.atlasian.plugins.jediesStats.api.MyPluginComponent;
import com.atlasian.plugins.jediesStats.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}