package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1722")
public class Somador1722 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
