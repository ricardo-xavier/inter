package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador597")
public class Somador597 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
