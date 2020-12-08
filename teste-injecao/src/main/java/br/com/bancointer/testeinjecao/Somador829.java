package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador829")
public class Somador829 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
