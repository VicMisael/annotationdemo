package com.example.annnotationdemo.annotation.processor;

import com.example.annnotationdemo.annotation.GetterForNullString;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@SupportedAnnotationTypes("com.example.annotationdemo.annotation.GetterForNullString")
public class GetterForNullStringProcessor extends AbstractProcessor {

    private Messager messager; //For printing logs
    private Elements elementUtils; //For processing elements
    private Types typeUtils;
    private Filer filer;  //Used to create java files or class files

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
        elementUtils = processingEnv.getElementUtils();
        filer = processingEnv.getFiler();
        typeUtils = processingEnv.getTypeUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return  false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
    @Override
    public Set<String> getSupportedAnnotationTypes(){
        Set<String> set = new HashSet<>();
        set.add(GetterForNullString.class.getCanonicalName());
        return Collections.unmodifiableSet(set);
    }


}
