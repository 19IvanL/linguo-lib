package ams2.linguo.queries;

import ams2.linguo.interfaces.ITestQueries;

public class TestQueries implements ITestQueries {

	@Override
	public String getHelloWorld() {
		String string = "Hello world";
		return string;
	}

}
