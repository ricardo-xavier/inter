package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1746")
public class Somador1746 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
