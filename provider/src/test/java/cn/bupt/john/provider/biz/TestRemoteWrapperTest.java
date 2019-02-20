package cn.bupt.john.provider.biz;

import javax.annotation.Resource;

import cn.bupt.john.provider.ProviderApplicationTests;
import org.junit.Test;
import cn.bupt.john.wrapper.TestRemoteWrapper;

/**
 *
 * @author xjohn
 * @since 20 February 2019
 */
public class TestRemoteWrapperTest extends ProviderApplicationTests {

	@Resource
	private TestRemoteWrapper testRemoteWrapper;

	@Test
	public void testInvoke() {
		testRemoteWrapper.testRemoteInvoke();
	}
}
