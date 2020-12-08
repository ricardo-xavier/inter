package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador155")
public class Somador155 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
