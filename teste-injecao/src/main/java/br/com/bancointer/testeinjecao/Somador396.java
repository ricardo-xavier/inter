package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador396")
public class Somador396 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
