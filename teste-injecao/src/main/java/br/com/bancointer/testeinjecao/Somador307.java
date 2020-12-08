package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador307")
public class Somador307 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
