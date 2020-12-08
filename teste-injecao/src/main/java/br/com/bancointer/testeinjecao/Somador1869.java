package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1869")
public class Somador1869 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
