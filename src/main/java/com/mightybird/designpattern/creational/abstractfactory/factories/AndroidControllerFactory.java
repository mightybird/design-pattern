package com.mightybird.designpattern.creational.abstractfactory.factories;

import com.mightybird.designpattern.creational.abstractfactory.controllers.AndroidInterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.AndroidOperationController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.InterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.OperationController;

public class AndroidControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
