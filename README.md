# JUnit Demo
Starter project for learning Unit Test with JUnit

显式的调用jacoco来生成报告：
mvn jacoco:prepare-agent test jacoco:report
要求surefile插件中没有指定argLine参数，否则无法生成jacoco.exec


通过maven lifecycle生成：
mvn clean test
不要将plugin放到<pluginManagement>下，会导致jacoco不能被maven phase触发

