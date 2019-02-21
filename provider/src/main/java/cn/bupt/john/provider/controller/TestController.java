package cn.bupt.john.provider.controller;

import javax.annotation.Resource;

import cn.bupt.john.wrapper.TestRemoteWrapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xjohn
 * @since 20 February 2019
 */
@RestController
@RequestMapping("/")
public class TestController {

	@Resource
	private TestRemoteWrapper testRemoteWrapper;

	@GetMapping("test")
	public void test() {
		testRemoteWrapper.testRemoteInvoke();
	}
}
