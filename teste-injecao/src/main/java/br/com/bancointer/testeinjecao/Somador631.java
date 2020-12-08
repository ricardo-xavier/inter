package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador631")
public class Somador631 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
