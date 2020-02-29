/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 14:46:03 GMT 2020
 */

package org.zalando.jackson.datatype.money;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import javax.money.CurrencyUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.zalando.jackson.datatype.money.CurrencyUnitSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CurrencyUnitSerializer_ESTest extends CurrencyUnitSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CurrencyUnitSerializer currencyUnitSerializer0 = new CurrencyUnitSerializer();
      CurrencyUnit currencyUnit0 = mock(CurrencyUnit.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(currencyUnit0).getCurrencyCode();
      // Undeclared exception!
      try { 
        currencyUnitSerializer0.serialize(currencyUnit0, (JsonGenerator) null, (SerializerProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.zalando.jackson.datatype.money.CurrencyUnitSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CurrencyUnitSerializer currencyUnitSerializer0 = new CurrencyUnitSerializer();
      JavaType javaType0 = mock(JavaType.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        currencyUnitSerializer0.acceptJsonFormatVisitor((JsonFormatVisitorWrapper) null, javaType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.zalando.jackson.datatype.money.CurrencyUnitSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CurrencyUnitSerializer currencyUnitSerializer0 = new CurrencyUnitSerializer();
      CurrencyUnit currencyUnit0 = mock(CurrencyUnit.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(currencyUnit0).getCurrencyCode();
      JsonGenerator jsonGenerator0 = mock(JsonGenerator.class, new ViolatedAssumptionAnswer());
      currencyUnitSerializer0.serialize(currencyUnit0, jsonGenerator0, (SerializerProvider) null);
      assertFalse(currencyUnitSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CurrencyUnitSerializer currencyUnitSerializer0 = new CurrencyUnitSerializer();
      JsonFormatVisitorWrapper jsonFormatVisitorWrapper0 = mock(JsonFormatVisitorWrapper.class, new ViolatedAssumptionAnswer());
      doReturn((JsonStringFormatVisitor) null).when(jsonFormatVisitorWrapper0).expectStringFormat(any(com.fasterxml.jackson.databind.JavaType.class));
      JavaType javaType0 = mock(JavaType.class, new ViolatedAssumptionAnswer());
      currencyUnitSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper0, javaType0);
      assertFalse(currencyUnitSerializer0.isUnwrappingSerializer());
  }
}
