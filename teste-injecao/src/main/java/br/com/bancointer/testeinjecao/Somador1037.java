package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1037")
public class Somador1037 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
