package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador670")
public class Somador670 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
