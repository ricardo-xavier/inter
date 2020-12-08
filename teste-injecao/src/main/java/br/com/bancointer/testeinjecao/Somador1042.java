package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1042")
public class Somador1042 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
