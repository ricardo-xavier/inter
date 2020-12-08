package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1105")
public class Somador1105 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
