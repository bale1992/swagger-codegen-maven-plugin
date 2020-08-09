package com.bale.codegen;

import com.bale.entity.CodeGenCfgEntity;
import io.swagger.codegen.languages.JavaClientCodegen;

public class JavaxRsServerCodeGen extends JavaClientCodegen {

    private String servicePackage = "";

    public JavaxRsServerCodeGen(CodeGenCfgEntity codeGenCfg) {
        this.outputFolder = codeGenCfg.getOutputBasePath();
        this.apiPackage = codeGenCfg.getApiPackage();
        this.modelPackage = codeGenCfg.getModelPackage();
        this.servicePackage = codeGenCfg.getServicePackage();
    }

    public String servicePackage() {
        return servicePackage;
    }
}
