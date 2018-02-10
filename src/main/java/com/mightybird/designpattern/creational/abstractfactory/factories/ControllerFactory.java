package com.mightybird.designpattern.creational.abstractfactory.factories;

import com.mightybird.designpattern.creational.abstractfactory.controllers.InterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.OperationController;

public interface ControllerFactory {
    OperationController createOperationController();

    InterfaceController createInterfaceController();

}
