package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1144")
public class Somador1144 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
