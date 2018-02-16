package com.mightybird.designpattern;

import com.mightybird.designpattern.creational.abstractfactory.controllers.InterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.OperationController;
import com.mightybird.designpattern.creational.abstractfactory.factories.ControllerFactory;
import com.mightybird.designpattern.creational.builder.DisplayMode;
import com.mightybird.designpattern.creational.builder.DisplayModeBuilder;
import com.mightybird.designpattern.creational.builder.DisplayModeDirector;
import com.mightybird.designpattern.creational.factorymethod.factories.ReaderFactory;
import com.mightybird.designpattern.creational.factorymethod.readers.PictureReader;
import com.mightybird.designpattern.creational.prototype.deepclone.AddressD;
import com.mightybird.designpattern.creational.prototype.deepclone.CustomerD;
import com.mightybird.designpattern.creational.prototype.shallowclone.AddressS;
import com.mightybird.designpattern.creational.prototype.shallowclone.CustomerS;
import com.mightybird.designpattern.creational.simplefactory.exception.UnSupportedShapeException;
import com.mightybird.designpattern.creational.simplefactory.factory.ShapeFactory;
import com.mightybird.designpattern.creational.simplefactory.shapes.Shape;
import com.mightybird.designpattern.creational.singleton.eagersingleton.EagerThread;
import com.mightybird.designpattern.creational.singleton.iodhsingleton.IoDHThread;
import com.mightybird.designpattern.creational.singleton.lazysingleton.LazyThread;
import com.mightybird.designpattern.structural.adapter.Adapter;
import com.mightybird.designpattern.structural.adapter.Target;
import com.mightybird.designpattern.structural.bridge.Converter;
import com.mightybird.designpattern.structural.bridge.ReaderImplementor;
import com.mightybird.designpattern.structural.composite.safe.*;
import com.mightybird.designpattern.structural.composite.transparent.*;
import com.mightybird.designpattern.structural.decorator.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DesignPatternApplication.class, args);

//        Creational Clients
//        simpleFactoryClient(context);
//        factoryMethodClient(context);
//        abstractFactoryClient(context);
//        singletonClient();
//        prototypeClient();
//        builderClient(context);

//        Structural Clients
//        adapterClient(context, "username");
//        bridgeClient(context);
//        compositeClient();
        decoratorClient();

//        Behavioral Clients
    }

    private static void decoratorClient() {
        Component component1, component2, shiftLetterEncrypter, reverseEncrypter, modEncrypter;
        component1 = new Username("MightyBird");
        shiftLetterEncrypter = new ShiftLetterEncrypter(component1);
        reverseEncrypter = new ReverseEncrypter(shiftLetterEncrypter);
        modEncrypter = new ModEncrypter(reverseEncrypter);
        modEncrypter.show();
        component2 = new Password("Np@#cvb1689");
        modEncrypter = new ModEncrypter(component2);
        reverseEncrypter = new ReverseEncrypter(modEncrypter);
        shiftLetterEncrypter = new ShiftLetterEncrypter(reverseEncrypter);
        shiftLetterEncrypter.show();
    }

    private static void compositeClient() {
        // Transparent Composite Pattern
        TransparentComponent tContainer1, tContainer2, tContainer3, tLeaf1, tLeaf2, tLeaf3, tLeaf4;
        tContainer1 = new TWindow("TWindowRoot");
        tContainer2 = new TWindow("TWindow");
        tContainer3 = new TPanel("TPanel");
        tLeaf1 = new TButton("TButtonInWindow");
        tLeaf2 = new TTextForm("TTextFormInWindow");
        tLeaf3 = new TButton("TButtonInPanel");
        tLeaf4 = new TTextForm("TTextFormInPanel");
        tContainer2.add(tLeaf1);
        tContainer2.add(tLeaf2);
        tContainer3.add(tLeaf3);
        tContainer3.add(tLeaf4);
        tContainer1.add(tContainer2);
        tContainer1.add(tContainer3);
        tContainer1.operation();
        // Safe Composite Pattern
        SafeComponent sLeaf1, sLeaf2, sLeaf3, sLeaf4;
        SafeContainer sContainer1, sContainer2, sContainer3;
        sContainer1 = new SPanel("SPanelRoot");
        sContainer2 = new SWindow("SWindow");
        sContainer3 = new SPanel("SPanel");
        sLeaf1 = new SButton("SButtonInWindow");
        sLeaf2 = new STextForm("STextFormInWindow");
        sLeaf3 = new SButton("SButtonInPanel");
        sLeaf4 = new STextForm("STextFormInPanel");
        sContainer2.add(sLeaf1);
        sContainer2.add(sLeaf2);
        sContainer3.add(sLeaf3);
        sContainer3.add(sLeaf4);
        sContainer1.add(sContainer2);
        sContainer1.add(sContainer3);
        sContainer1.operation();
    }

    private static void bridgeClient(ConfigurableApplicationContext context) {
        String converterClassName = context.getEnvironment().getProperty("bridge.converterClassName");
        String readerClassName = context.getEnvironment().getProperty("bridge.readerClassName");
        Converter converter = null;
        try {
            Class<?> converterClass = Class.forName(converterClassName);
            converter = (Converter) converterClass.getDeclaredConstructor().newInstance();
            Class<?> readerClass = Class.forName(readerClassName);
            ReaderImplementor reader = (ReaderImplementor) readerClass.getDeclaredConstructor().newInstance();
            converter.setReader(reader);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        assert converter != null;
        converter.convert();
    }

    private static void adapterClient(ConfigurableApplicationContext context, String str) {
        String className = context.getEnvironment().getProperty("adapter.adapterClassName");
        Target target = null;
        try {
            Class<?> adapterClass = Class.forName(className);
            target = (Adapter) adapterClass.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        assert target != null;
        System.out.println(target.encryptUserPass(str));
    }

    private static void builderClient(ConfigurableApplicationContext context) {
        String className = context.getEnvironment().getProperty("builder.builderClassName");
        DisplayModeBuilder builder = null;
        try {
            Class<?> builderClass = Class.forName(className);
            builder = (DisplayModeBuilder) builderClass.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        DisplayModeDirector director = new DisplayModeDirector();
        DisplayMode displayMode = director.construct(builder);
        System.out.println(displayMode.toString());
    }

    private static void prototypeClient() {
        AddressS addressS = new AddressS();
        addressS.setCity("Xian");
        addressS.setStreet("DaZhai Road");
        addressS.setBuilding("Red Maple");
        CustomerS customerS1 = new CustomerS();
        customerS1.setName("niepeng");
        customerS1.setAddress(addressS);
        CustomerS customerS2 = customerS1.shallowClone();
        System.out.println(customerS1.getAddress() == customerS2.getAddress());
        AddressD addressD = new AddressD();
        addressD.setCity("Xian");
        addressD.setStreet("DaZhai Road");
        addressD.setBuilding("Red Maple");
        CustomerD customerD1 = new CustomerD();
        customerD1.setName("niepeng");
        customerD1.setAddress(addressD);
        CustomerD customerD2 = null;
        try {
            customerD2 = customerD1.deepClone();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert customerD2 != null;
        System.out.println(customerD1.getAddress() == customerD2.getAddress());


    }

    private static void singletonClient() {
        new EagerThread().start();
        new EagerThread().start();
        new LazyThread().start();
        new LazyThread().start();
        new IoDHThread().start();
        new IoDHThread().start();
    }

    private static void abstractFactoryClient(ConfigurableApplicationContext context) {
        String className = context.getEnvironment().getProperty("abstractFactory.className");
        Class<?> factory = null;
        try {
            factory = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Unsupported Operating System!");
            e.printStackTrace();
        }
        ControllerFactory controllerFactory = null;
        try {
            assert factory != null;
            controllerFactory = (ControllerFactory) factory.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        assert controllerFactory != null;
        OperationController operationController = controllerFactory.createOperationController();
        InterfaceController interfaceController = controllerFactory.createInterfaceController();
        operationController.powerOn();
        interfaceController.call();
        operationController.powerOff();
    }

    private static void factoryMethodClient(ConfigurableApplicationContext context) {
        String className = context.getEnvironment().getProperty("factoryMethod.className");
        Class<?> factory = null;
        try {
            factory = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ReaderFactory readerFactory = null;
        try {
            assert factory != null;
            readerFactory = (ReaderFactory) factory.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        assert readerFactory != null;
        PictureReader reader = readerFactory.createPictureReader();
        reader.open();
        reader.close();
    }

    private static void simpleFactoryClient(ConfigurableApplicationContext context) {
        String type = context.getEnvironment().getProperty("simpleFactory.shapeType");
        try {
            Shape shape = ShapeFactory.getShape(type);
            shape.draw();
            shape.erase();
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
