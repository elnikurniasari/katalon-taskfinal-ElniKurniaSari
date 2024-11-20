<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create booking ID firstname null</name>
   <tag></tag>
   <elementGuidId>189617bd-b196-4530-9a4e-53e14b67b54d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;firstname\&quot; : null,\n    \&quot;lastname\&quot; : \&quot;${lastname}\&quot;,\n    \&quot;totalprice\&quot; : ${TotalPrice},\n    \&quot;depositpaid\&quot; : ${DepositePaid},\n    \&quot;bookingdates\&quot; : {\n        \&quot;checkin\&quot; : \&quot;${Checkin}\&quot;,\n        \&quot;checkout\&quot; : \&quot;${Checkout}\&quot;\n    },\n    \&quot;additionalneeds\&quot; : \&quot;Breakfast\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>2e7248b7-0118-42c0-b922-b1b959839ed1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>0c1bb42c-4255-4a7b-b6d7-69d2ff30409e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.7.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.Base_URL}/booking</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Elni'</defaultValue>
      <description></description>
      <id>77533800-3416-42f9-997d-46b1dfdd0a7e</id>
      <masked>false</masked>
      <name>firstname</name>
   </variables>
   <variables>
      <defaultValue>'KurniaS'</defaultValue>
      <description></description>
      <id>ed3ea564-418b-4de2-b6d0-910af6eea034</id>
      <masked>false</masked>
      <name>lastname</name>
   </variables>
   <variables>
      <defaultValue>10000</defaultValue>
      <description></description>
      <id>20c246e0-6a15-4f81-81e0-33357d0aea35</id>
      <masked>false</masked>
      <name>TotalPrice</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>7acd272e-04be-4a04-8fbd-cb2f642cee2a</id>
      <masked>false</masked>
      <name>DepositePaid</name>
   </variables>
   <variables>
      <defaultValue>'2024-11-01'</defaultValue>
      <description></description>
      <id>41d11d8d-2075-4efc-b9ed-f78ff8b1ea79</id>
      <masked>false</masked>
      <name>Checkin</name>
   </variables>
   <variables>
      <defaultValue>'2024-11-10'</defaultValue>
      <description></description>
      <id>ff31522c-c4aa-4872-af18-20ad3a521340</id>
      <masked>false</masked>
      <name>Checkout</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 500)

assertThat(response.getStatusCode()).isEqualTo(500)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
