package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1158")
public class Somador1158 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
