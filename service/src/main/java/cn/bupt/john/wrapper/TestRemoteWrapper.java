package cn.bupt.john.wrapper;

import javax.annotation.Resource;

import cn.bupt.john.remote.TestRemote;

import org.springframework.stereotype.Service;

/**
 *
 * @author xjohn
 * @since 20 February 2019
 */
@Service
public class TestRemoteWrapper {

	@Resource
	private TestRemote testRemote;

	public void testRemoteInvoke() {
		System.out.println(testRemote.testRemoteMethod("request"));
	}
}
