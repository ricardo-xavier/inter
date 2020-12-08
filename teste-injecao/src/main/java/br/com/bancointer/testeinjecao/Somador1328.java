package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1328")
public class Somador1328 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
