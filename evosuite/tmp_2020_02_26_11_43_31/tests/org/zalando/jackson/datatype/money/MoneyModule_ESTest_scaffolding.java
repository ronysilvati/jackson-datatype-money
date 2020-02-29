/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 26 14:47:36 GMT 2020
 */

package org.zalando.jackson.datatype.money;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class MoneyModule_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.zalando.jackson.datatype.money.MoneyModule"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\ronys\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\ronys\\git\\jackson-datatype-money"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\ronys"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "ronys"); 
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MoneyModule_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.databind.Module",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.exc.PropertyBindingException",
      "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException",
      "org.zalando.jackson.datatype.money.MonetaryAmountFactory",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier",
      "com.fasterxml.jackson.core.Versioned",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.ser.BeanSerializerModifier",
      "com.fasterxml.jackson.databind.JsonSerializable",
      "com.fasterxml.jackson.databind.type.ArrayType",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMember",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.jsontype.NamedType",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "com.fasterxml.jackson.databind.type.MapLikeType",
      "com.fasterxml.jackson.databind.ser.ResolvableSerializer",
      "com.fasterxml.jackson.core.JsonParseException",
      "com.fasterxml.jackson.databind.type.MapType",
      "org.zalando.jackson.datatype.money.MonetaryAmountDeserializer",
      "org.javamoney.moneta.RoundedMoney",
      "org.javamoney.moneta.Money",
      "org.javamoney.moneta.spi.DefaultNumberValue",
      "com.fasterxml.jackson.core.Version",
      "com.fasterxml.jackson.core.util.VersionUtil",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.CollectionType",
      "org.zalando.jackson.datatype.money.AmountWriter",
      "com.fasterxml.jackson.databind.type.TypeModifier",
      "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver",
      "com.fasterxml.jackson.databind.JsonMappingException",
      "com.fasterxml.jackson.databind.node.JsonNodeCreator",
      "org.zalando.jackson.datatype.money.DecimalAmountWriter",
      "org.javamoney.moneta.FastMoney",
      "com.fasterxml.jackson.databind.exc.MismatchedInputException",
      "com.fasterxml.jackson.core.JsonGenerator",
      "com.fasterxml.jackson.databind.ser.Serializers",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.ser.ContextualSerializer",
      "com.fasterxml.jackson.databind.module.SimpleDeserializers",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.databind.cfg.ConfigOverride",
      "org.zalando.jackson.datatype.money.BigDecimalAmountWriter",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.node.ObjectNode",
      "com.fasterxml.jackson.databind.deser.Deserializers",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.databind.type.ClassKey",
      "com.fasterxml.jackson.databind.deser.KeyDeserializers",
      "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler",
      "com.fasterxml.jackson.databind.Module$SetupContext",
      "com.fasterxml.jackson.databind.ser.Serializers$Base",
      "org.zalando.jackson.datatype.money.MoneyModule",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable",
      "com.fasterxml.jackson.databind.node.ContainerNode",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.type.CollectionLikeType",
      "com.fasterxml.jackson.core.TreeNode",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy",
      "org.zalando.jackson.datatype.money.CurrencyUnitSerializer",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.databind.jsonschema.SchemaAware",
      "com.fasterxml.jackson.databind.deser.NullValueProvider",
      "com.fasterxml.jackson.databind.AbstractTypeResolver",
      "com.fasterxml.jackson.databind.module.SimpleSerializers",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.fasterxml.jackson.core.exc.StreamReadException",
      "org.apiguardian.api.API",
      "org.zalando.jackson.datatype.money.MonetaryAmountSerializer",
      "org.apiguardian.api.API$Status",
      "org.zalando.jackson.datatype.money.MonetaryAmountFormatFactory",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "org.zalando.jackson.datatype.money.CurrencyUnitDeserializer",
      "org.zalando.jackson.datatype.money.FieldNames",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.cfg.ConfigFeature",
      "com.fasterxml.jackson.databind.type.ReferenceType",
      "org.zalando.jackson.datatype.money.QuotedDecimalAmountWriter",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.cfg.MutableConfigOverride",
      "com.fasterxml.jackson.core.TokenStreamFactory"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.fasterxml.jackson.databind.Module$SetupContext", false, MoneyModule_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.money.MonetaryOperator", false, MoneyModule_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.zalando.jackson.datatype.money.AmountWriter", false, MoneyModule_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MoneyModule_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.fasterxml.jackson.databind.Module",
      "org.zalando.jackson.datatype.money.MoneyModule",
      "org.apiguardian.api.API$Status",
      "org.zalando.jackson.datatype.money.FieldNames",
      "org.zalando.jackson.datatype.money.MonetaryAmountFormatFactory",
      "com.fasterxml.jackson.core.util.VersionUtil",
      "com.fasterxml.jackson.core.Version",
      "org.javamoney.moneta.ToStringMonetaryAmountFormat$ToStringMonetaryAmountFormatStyle",
      "org.zalando.jackson.datatype.money.DecimalAmountWriter",
      "org.zalando.jackson.datatype.money.QuotedDecimalAmountWriter",
      "com.fasterxml.jackson.databind.ser.Serializers$Base",
      "com.fasterxml.jackson.databind.module.SimpleSerializers",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "org.zalando.jackson.datatype.money.CurrencyUnitSerializer",
      "com.fasterxml.jackson.databind.type.ClassKey",
      "org.zalando.jackson.datatype.money.MonetaryAmountSerializer",
      "com.fasterxml.jackson.databind.module.SimpleDeserializers",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "org.zalando.jackson.datatype.money.CurrencyUnitDeserializer",
      "org.zalando.jackson.datatype.money.MonetaryAmountDeserializer"
    );
  }
}