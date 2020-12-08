package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1783")
public class Somador1783 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
