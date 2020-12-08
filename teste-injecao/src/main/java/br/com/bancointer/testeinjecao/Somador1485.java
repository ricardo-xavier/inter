package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1485")
public class Somador1485 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
