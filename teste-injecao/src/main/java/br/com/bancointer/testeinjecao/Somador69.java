package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador69")
public class Somador69 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
