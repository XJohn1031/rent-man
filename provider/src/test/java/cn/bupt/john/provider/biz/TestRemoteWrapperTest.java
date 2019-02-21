package cn.bupt.john.provider.biz;

import javax.annotation.Resource;

import cn.bupt.john.wrapper.TestRemoteWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author xjohn
 * @since 20 February 2019
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRemoteWrapperTest {

	@Resource
	private TestRemoteWrapper testRemoteWrapper;

	@Test
	public void testInvoke() {
		testRemoteWrapper.testRemoteInvoke();
	}
}
