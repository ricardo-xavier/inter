package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1314")
public class Somador1314 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
