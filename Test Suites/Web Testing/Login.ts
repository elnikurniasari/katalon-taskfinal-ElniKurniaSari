<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>b8bb7aac-9336-4d6b-aea9-6f47e68fea1c</testSuiteGuid>
   <testCaseLink>
      <guid>ced7eb02-1f0c-41b0-8d6e-06c133489ac3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Web Testing/TC02 Login/TC02-01 Succcess login with valid email and password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>58fcac76-8f71-402b-8cea-57f00a480b1c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Web Testing/Login Valid</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>58fcac76-8f71-402b-8cea-57f00a480b1c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Email</value>
         <variableId>00260f3c-0a68-4d21-8676-41b0daba2326</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>58fcac76-8f71-402b-8cea-57f00a480b1c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>84a75a09-e292-4177-a4e5-7fcd55eb3eb7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>6618663a-1886-4228-b1f5-32cac218dc1d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3b7dfb4e-a128-47c3-b242-071daf21fdd8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Web Testing/TC02 Login/TC02-02 Failed login with invalid email</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>ca7c7df8-1421-46f1-a08c-8e2660876b24</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>3fbdb6cd-df09-48f4-abef-ae9f62e06cec</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2d91ee3a-8f82-4e22-9db3-096ee8726ba9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Web Testing/TC02 Login/TC02-03 Failed login with invalid password</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>d59bab35-c260-4848-b561-eaa466c4b5ad</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c88eef1a-68c0-4315-9b7c-392d7ecf58c3</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>